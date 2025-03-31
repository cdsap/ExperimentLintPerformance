package com.performance.module_0_6

class Feature6UseCase0(
    private val repository: Feature6Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
