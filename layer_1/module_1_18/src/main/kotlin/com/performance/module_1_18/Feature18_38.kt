package com.performance.module_1_18

class Feature18UseCase2(
    private val repository: Feature18Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
