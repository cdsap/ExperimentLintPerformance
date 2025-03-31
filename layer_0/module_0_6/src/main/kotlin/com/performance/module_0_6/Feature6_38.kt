package com.performance.module_0_6

class Feature6UseCase2(
    private val repository: Feature6Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
