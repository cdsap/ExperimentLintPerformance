package com.performance.module_1_157

class Feature157UseCase0(
    private val repository: Feature157Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
