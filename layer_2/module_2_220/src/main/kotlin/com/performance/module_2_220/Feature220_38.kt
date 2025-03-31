package com.performance.module_2_220

class Feature220UseCase2(
    private val repository: Feature220Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
