package com.performance.module_2_216

class Feature216UseCase1(
    private val repository: Feature216Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
