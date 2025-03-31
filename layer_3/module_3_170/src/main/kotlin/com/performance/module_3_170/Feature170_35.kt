package com.performance.module_3_170

class Feature170UseCase1(
    private val repository: Feature170Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
