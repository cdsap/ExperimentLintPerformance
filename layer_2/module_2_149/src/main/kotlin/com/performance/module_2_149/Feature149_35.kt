package com.performance.module_2_149

class Feature149UseCase1(
    private val repository: Feature149Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
