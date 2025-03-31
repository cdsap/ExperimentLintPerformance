package com.performance.module_1_18

class Feature18UseCase1(
    private val repository: Feature18Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
