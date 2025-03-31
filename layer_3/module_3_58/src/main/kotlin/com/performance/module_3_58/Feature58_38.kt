package com.performance.module_3_58

class Feature58UseCase2(
    private val repository: Feature58Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
