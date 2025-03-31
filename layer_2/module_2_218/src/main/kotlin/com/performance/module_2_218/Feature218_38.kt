package com.performance.module_2_218

class Feature218UseCase2(
    private val repository: Feature218Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
