package com.performance.module_2_208

class Feature208UseCase1(
    private val repository: Feature208Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
