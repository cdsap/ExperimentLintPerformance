package com.performance.module_2_225

class Feature225UseCase2(
    private val repository: Feature225Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
