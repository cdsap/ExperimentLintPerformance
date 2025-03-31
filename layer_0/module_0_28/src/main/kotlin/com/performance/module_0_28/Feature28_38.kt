package com.performance.module_0_28

class Feature28UseCase2(
    private val repository: Feature28Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
