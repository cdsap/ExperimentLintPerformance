package com.performance.module_2_208

class Feature208UseCase2(
    private val repository: Feature208Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
