package com.performance.module_3_255

class Feature255UseCase1(
    private val repository: Feature255Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
