package com.performance.module_0_68

class Feature68UseCase1(
    private val repository: Feature68Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
