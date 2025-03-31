package com.performance.module_3_180

class Feature180UseCase1(
    private val repository: Feature180Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
