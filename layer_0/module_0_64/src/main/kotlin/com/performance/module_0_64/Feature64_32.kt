package com.performance.module_0_64

class Feature64UseCase0(
    private val repository: Feature64Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
