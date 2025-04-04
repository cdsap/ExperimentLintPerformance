package com.performance.module_0_28

class Feature28UseCase1(
    private val repository: Feature28Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
