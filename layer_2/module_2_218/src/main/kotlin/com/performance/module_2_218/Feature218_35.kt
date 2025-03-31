package com.performance.module_2_218

class Feature218UseCase1(
    private val repository: Feature218Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
