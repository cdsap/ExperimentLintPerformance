package com.performance.module_3_255

class Feature255UseCase2(
    private val repository: Feature255Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
