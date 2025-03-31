package com.performance.module_3_255

class Feature255UseCase0(
    private val repository: Feature255Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
