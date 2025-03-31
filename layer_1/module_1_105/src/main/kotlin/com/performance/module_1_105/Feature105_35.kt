package com.performance.module_1_105

class Feature105UseCase1(
    private val repository: Feature105Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
