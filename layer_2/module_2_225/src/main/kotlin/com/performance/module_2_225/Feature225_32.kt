package com.performance.module_2_225

class Feature225UseCase0(
    private val repository: Feature225Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
