package com.performance.module_2_200

class Feature200UseCase0(
    private val repository: Feature200Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
