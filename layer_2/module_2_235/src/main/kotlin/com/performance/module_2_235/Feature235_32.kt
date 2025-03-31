package com.performance.module_2_235

class Feature235UseCase0(
    private val repository: Feature235Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
