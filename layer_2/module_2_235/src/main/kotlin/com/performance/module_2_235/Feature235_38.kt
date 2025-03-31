package com.performance.module_2_235

class Feature235UseCase2(
    private val repository: Feature235Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
