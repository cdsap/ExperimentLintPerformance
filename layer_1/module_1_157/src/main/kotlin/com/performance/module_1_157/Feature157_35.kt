package com.performance.module_1_157

class Feature157UseCase1(
    private val repository: Feature157Repository1
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
