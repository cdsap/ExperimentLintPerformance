package com.performance.module_2_157

class Feature157UseCase2(
    private val repository: Feature157Repository2
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
