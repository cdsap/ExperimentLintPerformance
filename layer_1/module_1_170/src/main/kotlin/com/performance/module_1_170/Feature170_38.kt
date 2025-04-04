package com.performance.module_1_170

class Feature170UseCase2(
    private val repository: Feature170Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
