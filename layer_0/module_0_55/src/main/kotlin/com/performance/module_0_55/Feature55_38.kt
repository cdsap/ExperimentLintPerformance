package com.performance.module_0_55

class Feature55UseCase2(
    private val repository: Feature55Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
