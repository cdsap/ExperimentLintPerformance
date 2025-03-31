package com.performance.module_4_200

class Feature200UseCase2(
    private val repository: Feature200Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
