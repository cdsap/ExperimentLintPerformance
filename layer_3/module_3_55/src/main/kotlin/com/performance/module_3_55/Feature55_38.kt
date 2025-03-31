package com.performance.module_3_55

class Feature55UseCase2(
    private val repository: Feature55Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
