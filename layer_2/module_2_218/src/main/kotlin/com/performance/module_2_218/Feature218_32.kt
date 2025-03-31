package com.performance.module_2_218

class Feature218UseCase0(
    private val repository: Feature218Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
