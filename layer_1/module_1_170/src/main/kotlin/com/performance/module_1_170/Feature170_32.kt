package com.performance.module_1_170

class Feature170UseCase0(
    private val repository: Feature170Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
