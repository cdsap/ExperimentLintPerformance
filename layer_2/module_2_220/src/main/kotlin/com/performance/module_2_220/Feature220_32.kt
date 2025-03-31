package com.performance.module_2_220

class Feature220UseCase0(
    private val repository: Feature220Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
