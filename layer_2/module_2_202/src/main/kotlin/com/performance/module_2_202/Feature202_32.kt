package com.performance.module_2_202

class Feature202UseCase0(
    private val repository: Feature202Repository0
) {
    suspend operator fun invoke(): String {
        return repository.getData()
    }
}
