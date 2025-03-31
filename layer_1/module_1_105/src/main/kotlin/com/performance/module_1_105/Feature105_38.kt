package com.performance.module_1_105

class Feature105UseCase2(
    private val repository: Feature105Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
