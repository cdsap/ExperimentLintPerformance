package com.performance.module_2_212

class Feature212UseCase1(
    private val repository: Feature212Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
