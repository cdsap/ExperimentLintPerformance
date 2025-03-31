package com.performance.module_0_64

class Feature64UseCase2(
    private val repository: Feature64Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
