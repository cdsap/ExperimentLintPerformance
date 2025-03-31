package com.performance.module_2_208

class Feature208UseCase0(
    private val repository: Feature208Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
