package com.performance.module_2_221

class Feature221UseCase1(
    private val repository: Feature221Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
