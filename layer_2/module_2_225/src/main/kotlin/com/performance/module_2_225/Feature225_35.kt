package com.performance.module_2_225

class Feature225UseCase1(
    private val repository: Feature225Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
