package com.performance.module_0_55

class Feature55UseCase0(
    private val repository: Feature55Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
