package com.performance.module_0_64

class Feature64UseCase1(
    private val repository: Feature64Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
