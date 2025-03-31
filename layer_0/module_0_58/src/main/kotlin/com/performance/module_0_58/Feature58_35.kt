package com.performance.module_0_58

class Feature58UseCase1(
    private val repository: Feature58Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
