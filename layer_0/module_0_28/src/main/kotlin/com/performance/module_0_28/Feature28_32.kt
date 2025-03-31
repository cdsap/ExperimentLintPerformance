package com.performance.module_0_28

class Feature28UseCase0(
    private val repository: Feature28Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
