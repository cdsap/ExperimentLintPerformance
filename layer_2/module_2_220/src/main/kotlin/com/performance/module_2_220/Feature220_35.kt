package com.performance.module_2_220

class Feature220UseCase1(
    private val repository: Feature220Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
