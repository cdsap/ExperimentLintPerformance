package com.performance.module_0_55

class Feature55UseCase1(
    private val repository: Feature55Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
