package com.performance.module_3_58

class Feature58UseCase0(
    private val repository: Feature58Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
