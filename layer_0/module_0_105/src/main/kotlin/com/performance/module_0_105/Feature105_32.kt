package com.performance.module_0_105

class Feature105UseCase0(
    private val repository: Feature105Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
