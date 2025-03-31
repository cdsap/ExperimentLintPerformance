package com.performance.module_1_18

class Feature18UseCase0(
    private val repository: Feature18Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
