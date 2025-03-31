package com.performance.module_0_58

class Feature58UseCase0(
    private val repository: Feature58Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
