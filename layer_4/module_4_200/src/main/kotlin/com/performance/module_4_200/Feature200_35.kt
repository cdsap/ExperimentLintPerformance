package com.performance.module_4_200

class Feature200UseCase1(
    private val repository: Feature200Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
