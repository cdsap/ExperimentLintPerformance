package com.performance.module_2_235

class Feature235UseCase1(
    private val repository: Feature235Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
